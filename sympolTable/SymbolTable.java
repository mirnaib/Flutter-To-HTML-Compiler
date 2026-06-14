package sympolTable;

import ast.nodes.Classes.ClassName;
import ast.nodes.Classes.Classes;
import ast.nodes.Classes.Stack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTable {
      public boolean hasSyntaxError=false;
      public boolean hasSymantecError=false;

    Stack stack =new Stack();
    public HashMap<String, ArrayList<Classes>> classes = new HashMap<String,ArrayList<Classes>>();

   public ArrayList <ClassName> className =new ArrayList<>();

    private static SymbolTable single_instance = null;
    public static SymbolTable getInstance()
    {
        if (single_instance == null)
            single_instance = new SymbolTable();

        return single_instance;
    }
    public void generateHtmlCode(String  i) {
        try {
            FileWriter  fileWriterHtml = new FileWriter("output//"+i+".html");

                        fileWriterHtml.write("<!DOCTYPE html>\n" +
                                "<html lang=\"en\">\n" +
                                "\n" +
                                "<head>\n" +
                                "    <meta charset=\"UTF-8\">\n" +
                                "    <title>Document</title>\n" +
                                "</head>\n" +
                                "<style>\n" +
                                ".container {\n" +
                                "    text-align: center;\n" +
                                "}\n" +
                                "</style>\n" +
                                "\n" +
                                "<body> "+ "\n"+
                                "<div class=\"container\">"+"\n"+"<br>");


                        for (int j=0;j<classes.get(i).size();j++){
                            if(!classes.get(i).get(j).getClass().toString().contains("Stack"))
                            fileWriterHtml.write("\n"+classes.get(i).get(j).generateCode());
                            else {
                                stack= (Stack) classes.get(i).get(j);
                                fileWriterHtml.write("\n"+stack.generateHtmlCode());

                            }
                        }

                        fileWriterHtml.write("</div>\n"+"</body>\n" +

                                "</html>");
                        fileWriterHtml.close();


        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


    public void generatePhpCode(String  i) {
        try {
                FileWriter  fileWriterHtml = new FileWriter("output//"+i+".php");
                fileWriterHtml.write("<?php");
            for (int j=0;j<classes.get(i).size();j++){
                if(classes.get(i).get(j).getClass().toString().contains("Stack")){
                    stack= (Stack) classes.get(i).get(j);
                    fileWriterHtml.write("\n"+stack.generatePhpCode());
                }

            }
            fileWriterHtml.write("?>\n");
            fileWriterHtml.write(" <!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Document</title>\n" +
                    "</head>\n" +
                    "<style>\n" +
                    ".container {\n" +
                    "    text-align: center;\n" +
                    "}\n" +
                    "</style>\n" +
                    "\n" +
                    "<body> "+ "\n"+
                    "<div class=\"container\">"+"\n"+"<br>");


            for (int j=0;j<classes.get(i).size();j++){
                if(!classes.get(i).get(j).getClass().toString().contains("Stack"))
                    fileWriterHtml.write("\n"+classes.get(i).get(j).generateCode());
                else {
                    stack= (Stack) classes.get(i).get(j);
                    fileWriterHtml.write("\n"+stack.generateHtmlCode());

                }
            }

            fileWriterHtml.write("</div>\n"+"<br><br>"+"</body>\n" +
                    "\n" +
                    "</html>");
            fileWriterHtml.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void generateCode() {

        for (String i : classes.keySet()) {
            boolean containPhpCode=false;
            if (classes.get(i).size()>1){


                for (int j=0;j<classes.get(i).size();j++){
                    if(classes.get(i).get(j).getClass().toString().contains("Stack")){
                        generatePhpCode(i);
                        containPhpCode=true;
                        break;
                    }
                }
                if (!containPhpCode){
                    generateHtmlCode(i);
                }

            }


        }

    }

    public void write(String text) throws IOException {
        FileWriter syntaxError = new FileWriter("output//SyntaxError.txt");
        syntaxError.write(text);
        syntaxError.close();
    }
//    public  void print(){
//        for (String i : controllers.keySet()) {
//            System.out.println("\n"+ i+" : {" );
//            for (int j=0;j<controllers.get(i).size();j++){
//            System.out.println( controllers.get(i).get(j).symbol());
//            }
//            System.out.println("\n}");
//        }
//    }
}

