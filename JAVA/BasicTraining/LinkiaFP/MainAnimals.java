
class AnimalElectrico {
    private String nombre;
    private int nivelBateria; // porcentaje (0-100)

    public AnimalElectrico(String nombre, int nivelBateria) {
        this.nombre = nombre;
        this.nivelBateria = nivelBateria;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }


    public void comprobarBateria() {
        System.out.println("Comprobando batería de " + nombre + "...");
        if (nivelBateria > 70) {
            System.out.println(nombre + " tiene la batería en excelente estado (" + nivelBateria + "%)");
        } else if (nivelBateria > 20) {
            System.out.println(nombre + " tiene la batería a media carga  (" + nivelBateria + "%)");
        } else {
            System.out.println(nombre + " tiene la batería baja, necesita recarga  (" + nivelBateria + "%)");
        }
    }

    public void recargar() {
        nivelBateria = 100;
        System.out.println(nombre + " ha sido recargado completamente");
    }

    public void mostrarEstado() {
        System.out.println(nombre + " está activo con " + nivelBateria + "% de batería.");
    }
}


class PerroElectrico extends AnimalElectrico {

    public PerroElectrico(String nombre, int nivelBateria) {
        super(nombre, nivelBateria);
    }


    @Override
    public void comprobarBateria() {
        System.out.println("📡 Verificando energía del perro " + getNombre() + "...");
        if (getNivelBateria() > 80) {
            System.out.println(getNombre() + " está lleno de energía y listo para jugar.");
        } else if (getNivelBateria() > 40) {
            System.out.println(getNombre() + " tiene energía media, puede moverse un poco.");
        } else {
            System.out.println(getNombre() + " necesita recarga pronto.");
        }
    }

    public void moverCola() {
        if (getNivelBateria() > 10) {
            System.out.println(getNombre() + " mueve la cola con destellos eléctricos ");
            setNivelBateria(getNivelBateria() - 10);
        } else {
            System.out.println(getNombre() + " no tiene suficiente batería para mover la cola.");
        }
    }
}


class LabradorElectrico extends PerroElectrico {

    public LabradorElectrico(String nombre, int nivelBateria) {
        super(nombre, nivelBateria);
    }


    @Override
    public void comprobarBateria() {
        System.out.println(" Analizando batería avanzada del labrador " + getNombre() + "...");
        if (getNivelBateria() > 85) {
            System.out.println(getNombre() + " está al 100%, preparado para tareas de rescate ");
        } else if (getNivelBateria() > 50) {
            System.out.println(getNombre() + " tiene batería suficiente para patrullar ️");
        } else {
            System.out.println(getNombre() + " necesita carga inmediata ");
        }
    }

    public void detectarPersona() {
        System.out.println(getNombre() + " detecta una persona y activa luces azules ");
    }
}


class GatoElectrico extends AnimalElectrico {

    public GatoElectrico(String nombre, int nivelBateria) {
        super(nombre, nivelBateria);
    }


    @Override
    public void comprobarBateria() {
        System.out.println(" Verificando energía del gato " + getNombre() + "...");
        if (getNivelBateria() > 75) {
            System.out.println(getNombre() + " está lleno de energía y listo para explorar ");
        } else if (getNivelBateria() > 30) {
            System.out.println(getNombre() + " tiene energía moderada, se mueve lentamente ");
        } else {
            System.out.println(getNombre() + " se apaga para ahorrar energía ");
        }
    }

    public void ronronear() {
        if (getNivelBateria() > 5) {
            System.out.println(getNombre() + " ronronea con vibraciones electrónicas ");
            setNivelBateria(getNivelBateria() - 5);
        } else {
            System.out.println(getNombre() + " no tiene energía para ronronear...");
        }
    }
}

// MAIN
public class MainAnimals {
    public static void main(String[] args) {

        AnimalElectrico AnimalRobotico = new AnimalElectrico("RoboticoX", 80);
        PerroElectrico perro = new PerroElectrico("Cloud", 60);
        LabradorElectrico labrador = new LabradorElectrico("Barret", 90);
        GatoElectrico gato = new GatoElectrico("Tifa", 25);

        System.out.println("=== Comprobación de niveles de batería ===");
        AnimalRobotico.comprobarBateria();
        perro.comprobarBateria();
        labrador.comprobarBateria();
        gato.comprobarBateria();

        System.out.println("\n=== Acciones adicionales ===");
        perro.moverCola();
        labrador.detectarPersona();
        gato.ronronear();

        System.out.println("\n=== Cambio de nombre con setNombre() ===");
        perro.setNombre("Sephirot");
        System.out.println("El nuevo nombre del perro es: " + perro.getNombre());

        System.out.println("\n=== Estado actual ===");
        AnimalRobotico.mostrarEstado();
        perro.mostrarEstado();
        labrador.mostrarEstado();
        gato.mostrarEstado();
    }
}
