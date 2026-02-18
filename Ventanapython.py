import tkinter as tk

# Crear la ventana principal
ventana = tk.Tk()
ventana.title("Mi Ventana")
ventana.geometry("300x200")

# Función que se ejecuta al presionar el botón
def saludar():
    print("¡Botón presionado!")

# Crear botón
boton = tk.Button(ventana, text="Presióname", command=saludar)
boton.pack(pady=50)

# Ejecutar la ventana
ventana.mainloop()
