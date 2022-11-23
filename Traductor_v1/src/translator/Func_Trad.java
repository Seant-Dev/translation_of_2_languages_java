/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package translator;

import com.darkprograms.speech.translator.GoogleTranslate;
import java.io.IOException;

/**
 *
 * @author seant
 */
public class Func_Trad {
    public String translate_to_en(String es_to_en) throws IOException{
        return GoogleTranslate.translate("en", es_to_en);
    }
    
    public String translate_to_it(String es_to_it) throws IOException{
        return GoogleTranslate.translate("it", es_to_it);
    }
}