package ifpr.pgua.eic.listacompras.results;

public class Result {
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
