package actiontype.templateMethod.eg;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Applacation applacation = new Applacation();

        library.step1();

        if (applacation.step2()){
            library.step3();
        }

        for (int i = 0; i < 4; i++){
            applacation.step4();
        }

        library.step5();

        // New
        Library pLib = new NewApplaction();
        pLib.run();
    }
}
