class Vegetable {
    void wash() {
        System.out.println("Washing vegetable");
    }

    void chop() {
        System.out.println("Chopping vegetable");
    }
}

class Potato extends Vegetable {
    void prepareFries() {
        System.out.println("Preparing potato fries");
    }
}

class Carrot extends Vegetable {
    void prepareHalwa() {
        System.out.println("Preparing carrot Halwa"); 
    }
}

class Main {
    public static void main(String[] args) {
        Potato p = new Potato();
	Carrot c = new Carroot();
	

        p.wash();
        p.chop();
        p.prepareFries();

	c.wash();
	c.chop();
	c.prepareFries();
	
    }
}
