public class Main {
    public static void main(String [] args){
        try {
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);

            binDir.add(new File("vi", 10000));
            rootDir.add(new File("latex", 20000));

            rootDir.accept(new ListVisitor());

            System.out.println("----------------------");

            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrDir.add(yuki);
            usrDir.add(hanako);
            usrDir.add(tomura);

            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));

            rootDir.accept(new ListVisitor());
        }catch (FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
