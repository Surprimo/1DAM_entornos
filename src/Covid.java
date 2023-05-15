public class Covid {
    public static void main(String[] args) {
        System.out.println(covid(37, false, false, false ,false , false, false, false, false, "Alicante"));
        System.out.println(covid(39, true, true, false ,false , false, false, false, false, "Alicante"));
    }
    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidnevDisease, boolean respiratoryDisease, String provincia
    ){
        if (
                (bodyTemperature>= 38 && difficultyBreathing) ||
                        (bodyTemperature>= 38 && difficultyBreathing && (diabetes || cancer||isPregnant ||isOver60yearsold || hepatic ||kidnevDisease ||respiratoryDisease)) ||
                        (bodyTemperature>= 38 && (diabetes || cancer||isPregnant ||isOver60yearsold || hepatic ||kidnevDisease ||respiratoryDisease))){
            return "/diagnostico/"+provincia;
        }else if (bodyTemperature>= 38){
            return "/cuarentena/";
        } else{
            return "/diagnostico_bueno/";
        }
    }
}
