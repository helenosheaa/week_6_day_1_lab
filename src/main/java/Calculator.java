public class Calculator {
    private int numberone;
    private int numbertwo;

    public Calculator( int numberone, int numbertwo) {
        this.numberone = numberone;
        this.numbertwo = numbertwo;
    }

    public int add(){ return numberone + numbertwo;}

    public int subtract() { return numbertwo - numberone;
    }

    public int multiply() { return numbertwo * numberone;
    }

    public int divide() { return numbertwo / numberone;
    }
}



