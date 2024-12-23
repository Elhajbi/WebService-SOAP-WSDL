package WS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;
// POJO / Plain Old Java Object

@WebService(serviceName="BanqueWs")
public class BanqueService {
    @WebMethod(operationName = "conversionEutoToDH")
    public double conversion(@WebParam(name="montant") double montant){
        return montant*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="code") int code){

        return new Compte(code, 1000+Math.random()*9000, new Date());
    }
    @WebMethod
    public List<Compte> ListComptes(){
         return List.of(
                 new Compte( 1, 1000+Math.random()*9000, new Date()),
                 new Compte( 2, 1000+Math.random()*9000, new Date()),
                 new Compte( 3, 1000+Math.random()*9000, new Date())

         );
    }
}
