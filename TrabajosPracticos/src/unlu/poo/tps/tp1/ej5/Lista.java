package unlu.poo.tps.tp1.ej5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    private ArrayList<Tarea> tareas = new ArrayList<>();


    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public Tarea generarTarea() {
        Tarea tarea = new Tarea();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la tarea: ");
        String descripcion;
        descripcion = sc.nextLine();
        tarea.setDescripcion(descripcion);
        System.out.println("Ingrese del 1 al 3 la prioridad: ");
        int aux = sc.nextInt();
        switch (aux) {
            case 1:
                tarea.setPrioridad(Prioridad.BAJA);
                break;
            case 2:
                tarea.setPrioridad(Prioridad.MEDIA);
                break;
            case 3:
                tarea.setPrioridad(Prioridad.ALTA);
                break;
            default:
                System.out.println("Valor invalido, saliendo del programa");
                return null;
        }
        tarea.setEstado(false);
        System.out.println("Ingrese la fecha limite");

        System.out.print("Ingrese día: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese mes: ");
        int mes = sc.nextInt();

        System.out.print("Ingrese año: ");
        int anio = sc.nextInt();

        tarea.setFechaLimite(LocalDate.of(anio, mes, dia));
        tarea.setFechaCreacion(LocalDate.now());
        tarea.setFechaRealizada(null);
        return tarea;
    }


    public void cargarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public void mostrarTareas() {
        int count = 1;
        System.out.println("---------TAREAS---------");
        for (Tarea t : this.tareas) {
            System.out.println("Tarea nº" + count);
            t.mostrarTarea();
            count++;
        }
    }

    public void editarTarea(int n) {
        if (n - 1 > this.tareas.size() || n <= 0) {
            System.out.println("Posicion invalida, cerrando programa.");
        }
        Tarea t = this.tareas.get(n - 1);
        System.out.println("La lista seleccionada es: ");
        t.mostrarTarea();
        boolean flag = false;
        while (flag == false) {
            int opcion;
            System.out.println(
                    """
                            Ingrese un valor:
                            1. Cambiar Descripcion.
                            2. Cambiar Prioridad.
                            3. Terminar Tarea
                            0. Salir
                            """);
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la descripcion de la tarea: ");
                    String descripcion;
                    descripcion = sc.nextLine();
                    t.setDescripcion(descripcion);
                    break;
                case 2:
                    System.out.println("Ingrese del 1 al 3 la prioridad: ");
                    int aux = sc.nextInt();
                    switch (aux) {
                        case 1:
                            t.setPrioridad(Prioridad.BAJA);
                            break;
                        case 2:
                            t.setPrioridad(Prioridad.MEDIA);
                            break;
                        case 3:
                            t.setPrioridad(Prioridad.ALTA);
                            break;
                        default:
                            System.out.println("Valor invalido, saliendo del programa");
                            System.exit(0);
                    }
                case 3:
                    t.setEstado(false);
                    t.setFechaRealizada(LocalDate.now());
                    break;
                default:
                    flag = true;
            }

        }

    }
}
