package icesi.edu.co.Lavoro.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AnimalErrorCode {

    CODE_UD_01("dummy error");
    private String message;
}
