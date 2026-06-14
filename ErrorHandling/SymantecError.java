package ErrorHandling;

import ast.nodes.Classes.ClassName;
import ast.nodes.Classes.Stack;
import sympolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class SymantecError {
    SymbolTable symbolTable = SymbolTable.getInstance();;

    public ArrayList<String> Errors=new ArrayList<>();
    public SymantecError() {

    }
    public boolean checkClassesName(){

        for (ClassName c1 :symbolTable.className) {

            for (ClassName c2 :symbolTable.className) {
                if (Objects.equals(c1.getToken(), c2.getToken()) && !Objects.equals(c1.getLine(), c2.getLine())) {
                    String error="Error in line: "+c2.getLine()+"  Class : "+c1.getToken()+ " is already declared in line: " + c1.getLine();
                    Errors.add(error);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkClassToRout(){
        boolean isExist=false;
        Stack stack=new Stack();
        for (String c : symbolTable.classes.keySet()) {
            for (int i=0;i<symbolTable.classes.get(c).size();i++){
                if (symbolTable.classes.get(c).get(i).getClass().toString().contains("Stack")){
                    stack= (Stack) symbolTable.classes.get(c).get(i);

                    for (int j=0;j<symbolTable.className.size();j++){

                        if (symbolTable.className.get(j).getToken().equals(stack.getToken())){

                            isExist=true;
                        }
                    }
                    if (!isExist){
                        String error="Error in line "+symbolTable.classes.get(c).get(i).getLine()+" "+symbolTable.classes.get(c).get(i).getToken()+" : Undefined Class";
                        Errors.add(error);
                    }
                    isExist=false;
                }
            }
        }
        return isExist;
    }
public void checkErrors() throws IOException {

       if (!symbolTable.hasSyntaxError) {
           checkClassesName();
           checkClassToRout();
       }
    if (!Errors.isEmpty()){
        symbolTable.hasSymantecError=true;
    }
    for (int i=0;i<Errors.size();i++){
        FileWriter test = new FileWriter("output//SymantecError.txt");
        test.write(Errors.get(i));
        test.close();

    }
}

}
