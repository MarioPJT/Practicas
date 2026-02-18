import tkinter as tk
from tkinter import ttk

# Crear ventana principal
ventana = tk.Tk()
ventana.title("Ventana Moderna")
ventana.geometry("400x250")
ventana.configure(bg="#1e1e2f")  # Fondo oscuro

# Estilo moderno
style = ttk.Style()
style.theme_use("clam")

style.configure("TButton",
                font=("Segoe UI", 12),
                padding=10)

style.configure("TLabel",
                background="#1e1e2f",
                foreground="white",
                font=("Segoe UI", 14))

# Función del botón
def cambiar_texto():
    etiqueta.config(text="¡Botón presionado! 🚀")

# Etiqueta
etiqueta = ttk.Label(ventana, text="Ventana Moderna en Python")
etiqueta.pack(pady=30)

# Botón moderno
boton = ttk.Button(ventana, text="Haz clic aquí", command=cambiar_texto)
boton.pack()

# Ejecutar ventana
ventana.mainloop()
