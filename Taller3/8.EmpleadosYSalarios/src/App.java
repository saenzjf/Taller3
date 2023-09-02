public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(">>EMPLEADOS<<");

        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Asalariado("Juan", 3000000);
        empleados[1] = new TrabajadorPorHoras("Ana", 40, 4800);
        empleados[2] = new Asalariado("Carlos", 2500000);
        empleados[3] = new TrabajadorPorHoras("Luisa", 30, 4800);
        
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println();
        }
    }
}
