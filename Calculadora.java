public class Calculadora {

public static void main (String[] args) {
if(args.length==3){
try{
int op1 = Integer.parseInt(args[1]);
int op2 = Integer.parseInt(args[2]);

if("+".equals(args[0])){
System.out.println(op1 + " + " + op2 + " = " + (op1+op2));
}else if{"-".equals(args[0])){
System.out.println(op1 + " - " + op2 + " = " + (op1-op2));
}else{

System.out.println(args[0] + ": Operaci�n desconocida.");
}

} catch(Exception ex){
System.out.println("Par�metros incorrectos");
}
}else{
System.out.println("Uso: calculadora operando1 operando2");
}
}
}