package pack;
import java.io.File;

public class ListOfFile {

    protected File repository;


    public ListOfFile(String repository) {
        this.repository = new File(repository);
    }

    protected String[] listContenu (){
        String[] list = new String[0];
        list = repository.list();
        return list;
    }

    protected File[] listContenuProfondeur (){
        File[] file;
        file = repository.listFiles();
        return file;
    }

   // protected File[] listContenuProfondeurFiltre (FilenameFilter filtre){
 //       File[] file;
      //  file = repository.listFiles(filtre);
       // return file;
 //   }



    public String toString(String[] string) {
        String resultat = "";
        for (int i = 0; i<string.length ; i ++){
            resultat += string[i] + "\n";
        }
        return resultat;
    }


    public static void main(String [] args){

        ListOfFile list1 = new ListOfFile(".");
        String[] contenu = list1.listContenu();
        System.out.println(list1.toString(contenu));

        System.out.println("\n");

        File[] contenu2 = list1.listContenuProfondeur();




    }


}
