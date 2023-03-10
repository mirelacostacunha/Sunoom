package ifpr.pgua.eic.results;

/***
 * Classe responsável por representar o resultado de uma operação 
 * realizada. 
 */


 public abstract class Result {
    private String msg;

    public Result(String msg){
        this.msg = msg;
    }

    public static Result sucess(String msg){
        return new Sucess(msg);
    }

    public static Result fail(String msg){
        return new Fail(msg);
    }

    public String getMsg(){
        return msg;
    }
}

