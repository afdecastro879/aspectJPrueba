package aspectos;

/**
 * Created by andre on 21/09/2016.
 */
public aspect Logger {
    pointcut logger() : call(* co.example..*(..));

    before() : logger() {
        System.out.println("#### Signatura: "+thisJoinPointStaticPart.getSignature());
        boolean entro = false;
        for (int i = 0; i < thisJoinPoint.getArgs().length; i++) {
            if(!entro){
                System.out.println("#### Argumentos: ");
                entro=true;
            }
            System.out.println("\t"+thisJoinPoint.getArgs()[i].getClass().toString());
        }
        System.out.println("#### Target: "+thisJoinPoint.getTarget().getClass().toString());
    }

    after() returning(Object r): logger(){
        if(r!=null){
            System.out.println("#### Objeto retornado: "+r.getClass().getSimpleName());
        }
    }

    after() throwing(Throwable e): logger(){
        System.out.println("#### Excepcion: "+e.getMessage());
    }
}
