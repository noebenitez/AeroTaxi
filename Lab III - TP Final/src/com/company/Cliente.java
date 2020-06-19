package com.company;

public class Cliente {

    private String nombre;
    private String apellido;
    private int dni;
    private int edad;

    public Cliente(){}

    public Cliente(String nombre, String apellido, int dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void crearNuevo(int dni){
        this.setDni(dni);
        System.out.println("Nombre:");
        this.setNombre(Menu.scanner.nextLine());
        System.out.println("Apellido:");
        this.setApellido(Menu.scanner.nextLine());
        int edad;
        do {
            System.out.println("Edad:");
            edad = Menu.checkInt(Menu.scanner.nextLine());
            if (edad == -1){
                System.out.println("Ingrese la edad en números.");
            }
        }while (edad == -1);
    }

    @Override
    public String toString(){
        return "CLIENTE [ Nombre: " + nombre + " " + apellido +
                " -dni: " + dni + " -Edad: " + edad + "]";
    }
}
