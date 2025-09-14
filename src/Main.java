public class Main {
    public static void main(String[] args) {

    }

    // Abstracción
    abstract class AnimalAbstraccion {
        abstract void hacerSonido();
    }

    class PerroAbstraccion extends AnimalAbstraccion {
        void hacerSonido() {
            System.out.println("Guau (Abstracción)");
        }
    }

    class GatoAbstraccion extends AnimalAbstraccion {
        void hacerSonido() {
            System.out.println("Miau (Abstracción)");

            AnimalAbstraccion a1 = new PerroAbstraccion();
            AnimalAbstraccion a2 = new GatoAbstraccion();
            a1.hacerSonido();
            a2.hacerSonido();

        }
    }

    // Encapsulamiento
    class Persona {
        private String nombre;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;

            Persona p = new Persona();
            p.setNombre("Ana");
            p.setEdad(25);
            System.out.println("Persona: " + p.getNombre() + ", Edad: " + p.getEdad());
        }
    }

    // Herencia
    class AnimalHerencia {
        void comer() {
            System.out.println("Este animal come (Herencia)");
        }
    }

    class PerroHerencia extends AnimalHerencia {
        void ladrar() {
            System.out.println("Guau (Herencia)");

            PerroHerencia perroH = new PerroHerencia();
            perroH.comer(); // heredado
            perroH.ladrar();
        }
    }

    // Polimorfismo
    class AnimalPolimorfismo {
        void hacerSonido() {
            System.out.println("Sonido genérico de animal (Polimorfismo)");
        }
    }

    class PerroPolimorfismo extends AnimalPolimorfismo {
        void hacerSonido() {
            System.out.println("Guau (Polimorfismo)");
        }
    }

    class GatoPolimorfismo extends AnimalPolimorfismo {
        void hacerSonido() {
            System.out.println("Miau (Polimorfismo)");

            AnimalPolimorfismo ap = new PerroPolimorfismo();
            ap.hacerSonido();
            ap = new GatoPolimorfismo();
            ap.hacerSonido();
        }
    }
}