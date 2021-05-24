package ColorFinal;

public class Guessing {
    public int i = 0;
    public int o = 0;
    public int w = 0;
    public int m = 0;
    public String f;

    public void iul() {
        i++;
    }

    public void oul() {
        o++;
    }

    public void wul() {
        w++;
    }

    public void mul() {
        m++;
    }

    public String Final() {
        if (i == 2 && o == 0 && w == 1) {
            f = "Paulina Mitrea";
        }

        if (i == 1 && o == 2 && m == 1) {
            f = "Marius Dorinel Pascalau";
        }

        if (i == 2 && o == 1 && w == 1) {
            f = "Auguszta Szasz";
        }

        if (i == 1 && o == 4 && m == 1) {
            f = "Petru Dobra";
        }

        if (i == 2 && o == 3 && m == 1) {
            f = "Gheorghe Sebestyen Pal";
        }

        if (i == 2 && o == 2 && m == 1) {
            f = "Daniel Moga";
        }

        if (i == 0 && o == 7 && m == 1) {
            f = "Emil Teutan";
        }

        if (i == 3 && o == 2 && w == 1) {
            f = "Diana Monica Sas";
        }

        if (i == 1 && o == 6 && m == 1) {
            f = "Mircea Susca";
        }

        if (i == 4 && o == 3 && w == 1) {
            f = "Nicoleta Stroia";
        }

        if (i == 4 && o == 4 && m == 1) {
            f = "Mihai Olimpiu Tatar";
        }

        if (i == 5 && o == 3 && m == 1) {
            f = "Radu Florin Miron";
        }

        if (i == 3 && o == 4 && w == 1) {
            f = "Delia Alexandra Mitrea";
        }
        return f;
    }
}
