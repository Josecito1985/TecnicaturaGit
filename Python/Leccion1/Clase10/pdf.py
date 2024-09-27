from fpdf import FPDF

class PDF(FPDF):
    def header(self):
        self.set_font('Arial', 'B', 12)
        self.cell(0, 10, 'Informe sobre Calentamiento Global y Precipitaciones', 0, 1, 'C')
        self.ln(10)

    def chapter_title(self, title):
        self.set_font('Arial', 'B', 12)
        self.cell(0, 10, title, 0, 1, 'L')
        self.ln(5)

    def chapter_body(self, body):
        self.set_font('Arial', '', 12)
        self.multi_cell(0, 10, body)
        self.ln()

    def add_table(self, data, col_widths):
        self.set_font('Arial', 'B', 12)
        for row in data:
            for i, item in enumerate(row):
                self.cell(col_widths[i], 10, str(item), 1)
            self.ln()
        self.ln()

pdf = PDF()

pdf.add_page()

# Introduction
pdf.chapter_title("1. Representar en una Matriz")

pdf.chapter_body("Para este caso, consideraremos las probabilidades de que la temperatura media anual supere los 1.5 grados C y las anomalías de temperatura en el Ártico. Cada fila representará un año y cada columna un aspecto relevante.")

pdf.chapter_body("Matriz de Calentamiento Global:")
col_widths = [30, 80, 80]
data = [
    ["Año", "Prob. de Temp. > 1.5 grados C (%)", "Anomalía Temp. Ártico (en relación con 1991-2020)"],
    [2022, 10, 3],
    [2023, 10, 3],
    [2024, 10, 3],
    [2025, 10, 3],
    [2026, 10, 3]
]
pdf.add_table(data, col_widths)

pdf.chapter_body("Matriz de Precipitaciones:")
col_widths = [60, 80, 80]
data = [
    ["Región", "Prob. Más Lluvias (%)", "Prob. Menos Lluvias (%)"],
    ["Suroeste de Europa", 60, 40],
    ["Norte de Europa", 70, 30],
    ["Sahel", 80, 20],
    ["Noreste de Brasil", 75, 25],
    ["Australia", 65, 35]
]
pdf.add_table(data, col_widths)

# Markov Chains
pdf.chapter_title("2. Representar mediante cadena de Markov")

pdf.chapter_body("Podemos modelar los estados de temperatura y las transiciones entre estos estados como una cadena de Markov. Asumiremos dos estados: S0 (temperatura <= 1.5 grados C) y S1 (temperatura > 1.5 grados C).")

pdf.chapter_body("Estados:")
pdf.chapter_body("- S0: Temperatura <= 1.5 grados C\n- S1: Temperatura > 1.5 grados C")

pdf.chapter_body("Matriz de transición:")
col_widths = [30, 30, 30]
data = [
    ["", "S0", "S1"],
    ["S0", 0.90, 0.10],
    ["S1", 0.10, 0.90]
]
pdf.add_table(data, col_widths)

# Linear Equations
pdf.chapter_title("3. Representar mediante sistema de ecuaciones lineales")

pdf.chapter_body("Para modelar el calentamiento global y las precipitaciones, podemos usar sistemas de ecuaciones que relacionen las variables de interés.")

pdf.chapter_body("Ejemplo para la temperatura:")
pdf.chapter_body("T_{2022} = T0 + k\nT_{2023} = T_{2022} + k\nT_{2024} = T_{2023} + k\nT_{2025} = T_{2024} + k\nT_{2026} = T_{2025} + k\n\nDonde T0 es la temperatura inicial, y k es la tasa de cambio anual.")

# Sets
pdf.chapter_title("4. Representar en forma de conjuntos")

pdf.chapter_body("Podemos usar conjuntos para representar regiones y eventos climáticos.")

pdf.chapter_body("Conjuntos:\n- A = {regiones con aumento de temperatura}\n- B = {regiones con aumento de precipitaciones}")

pdf.chapter_body("Ejemplo:\n- A = {Ártico, Norte de Europa, Sahel}\n- B = {Norte de Europa, Sahel, Australia}")

# Relations
pdf.chapter_title("5. Representar mediante relaciones")

pdf.chapter_body("Las relaciones pueden ser usadas para describir las dependencias entre el calentamiento global y las precipitaciones.")

pdf.chapter_body("Relación:\n- R(a, b): a (región) está relacionado con b (evento).")

pdf.chapter_body("Ejemplo:\n- R(Ártico, aumento de temperatura)\n- R(Norte de Europa, aumento de precipitaciones)")

# Logical Form
pdf.chapter_title("6. Representar en forma lógica")

pdf.chapter_body("Usar lógica proposicional para representar las condiciones y probabilidades.")

pdf.chapter_body("Ejemplo:\n- P1: Probabilidad de que la temperatura supere 1.5 grados C.\n- P1 = 0.50 (50%).")

pdf.chapter_body("Lógica proposicional:\n- P1 => \"Los efectos del clima serán cada vez más perjudiciales\".\n- P2: Probabilidad de que un año sea el más cálido jamás registrado.\n- P2 = 0.93")

pdf.chapter_body("Lógica:\n- P2 => \"Uno de los años del período será el más cálido registrado\".")

# Save PDF
pdf_file = "/mnt/data/Informe_Calentamiento_Global_Precipitaciones.pdf"
pdf.output(pdf_file)

pdf_file
