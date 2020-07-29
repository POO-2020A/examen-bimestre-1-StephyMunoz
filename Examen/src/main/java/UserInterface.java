
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private int row;
    private String col;
    private Scanner scanner;
    private ArrayList<Plane> planes;
    private ArrayList<Seat> seats;
    private int option;
    private int intCol;
    private ArrayList<Passenger> passengers;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("Ingrese la cantidad de filas: ");
        this.row = Integer.valueOf(this.scanner.nextLine());
        System.out.println();
        System.out.print("Ingrese la cantidad de columnas: ");
        this.intCol = Integer.valueOf(this.scanner.nextLine());
        mapa();
        while (true) {
            action();

        }
    }

    public void mapa() {
        String letter = "";
        System.out.println("");
        System.out.println("Este es el mapa del avion: ");
        for (int i = 1; i <= this.row; i++) {
            System.out.print(i);
            switch (this.intCol) {
                case 1:
                    letter = "A";
                    break;
                case 2:
                    letter = "A B";
                    break;
                case 3:
                    letter = "A B C";
                    break;
                case 4:
                    letter = "A B C D";
                    break;
                case 5:
                    letter = "A B C D E";
                    break;
                case 6:
                    letter = "A B C D E F";
                    break;
                case 7:
                    letter = "A B C D E F G";
                    break;
                case 8:
                    letter = "A B C D E D F G H";
                    break;
                default:
                    break;
            }
            System.out.print(" " + letter);
            System.out.println("");
        }
    }

    public void action() {
        String name, lastname, columna;
        int fila, numCol = 0;
        System.out.println("");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Ingresar pasajero");
        System.out.println("2. Consultar asiento");
        System.out.println("3. Consultar pasajero");

        System.out.println("");

        System.out.print("Ingrese la opción: ");
        this.option = Integer.valueOf(scanner.nextLine());

        switch (this.option) {
            case 1:
                System.out.println("Ingresar un pasajero:");
                System.out.print("Ingrese el nombre del pasajero: ");
                name = scanner.nextLine();
                System.out.print("Ingrese el apellido del pasajero: ");
                lastname = scanner.nextLine();
                System.out.print("Ingrese la fila del asiento: ");
                fila = Integer.valueOf(scanner.nextLine());
                System.out.print("Ingrese la columna del asiento: ");
                columna = this.scanner.nextLine();
                switch (columna) {
                    case "A":
                        numCol = 1;
                        break;
                    case "B":
                        numCol = 2;
                        break;
                    case "C":
                        numCol = 3;
                        break;
                    case "D":
                        numCol = 4;
                        break;
                    case "E":
                        numCol = 5;
                        break;
                    case "F":
                        numCol = 6;
                        break;
                    case "G":
                        numCol = 7;
                        break;
                    case "H":
                        numCol = 8;
                        break;
                    default:
                        break;
                }

                Seat seat = new Seat(fila, columna);

                if (seat.isFree()) {
                    seat.setPassenger(new Passenger(name, lastname));
                    seat.setCol(columna);
                    seat.setRow(fila);
                    System.out.println("");
                    System.out.println("Pasajero ingresado!");
                    System.out.println("");
                    for (int i = 1; i <= fila; i++) {

                        if (fila == i) {
                            if (columna.equals("A")) {
                                seat.setCol("X");
                            }
                            if (columna.equals("B")) {
                                seat.setCol("X");
                            }
                            if (columna.equals("C")) {
                                seat.setCol("X");
                            }
                            if (columna.equals("D")) {
                                seat.setCol("X");
                            }
                            if (columna.equals("E")) {
                                seat.setCol("X");
                            }
                            if (columna.equals("F")) {
                                seat.setCol("X");
                            }
                            if (columna.equals("G")) {
                                seat.setCol("X");
                            }
                            if (columna.equals("H")) {
                                seat.setCol("X");
                            }
                        }
                    }
                    mapa();
                } else {
                    System.out.println("Asiento ocupado");
                }
                break;

            case 2:
                System.out.println("");
                System.out.println("Consulta de asiento.");
                System.out.print("Ingrese la fila del asiento: ");
                this.row = Integer.valueOf(scanner.nextLine());
                System.out.print("Ingrese la columna del asiento: ");
                this.col = this.scanner.nextLine();
                Seat seat1 = new Seat(this.row, this.col);
                System.out.println(seat1.toString());
                break;

            case 3:
                System.out.println("Consulta de pasajero.");
                System.out.println("Ingrese el nombre y apellido: ");
                name = this.scanner.nextLine();
                lastname = this.scanner.nextLine();
                Passenger passen = new Passenger(name, lastname);
                for (Seat sea1 : this.seats) {
                    if (passen.equals(sea1.getPassenger())) {
                        System.out.print("El pasajero se encuentra en el asiento: "
                                + sea1.getRow() + sea1.getCol());

                    } else {
                        System.out.println("El pasajero no se encuentra en el avión.");
                    }
                }
        }
    }

}
