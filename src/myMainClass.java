public class myMainClass {
    public static void main(String[] args) {
        Pencil pencil1 = new Pencil();
        pencil1.setColor("red");
        pencil1.setLength(20);

        Pencil pencil2 = new Pencil();
        pencil2.setColor("blue");
        pencil2.setLength(25);

        Pencil pencil3 = new Pencil();
        pencil3.setColor("black");
        pencil3.setLength(30);

        Pencil[] pencils = new Pencil[3];                           // one type of Array
        pencils[0] = pencil1;
        pencils[1] = pencil2;
        pencils[2] = pencil3;

        Pencil[] pencils1 = new Pencil[]{pencil1, pencil2, pencil3}; // second option how to write an Array

        for (int i = 0; i < pencils1.length; i++)
            System.out.println(pencils[i]);

    }
}
