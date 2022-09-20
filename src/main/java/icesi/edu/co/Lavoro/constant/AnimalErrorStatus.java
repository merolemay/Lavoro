package icesi.edu.co.Lavoro.constant;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AnimalErrorStatus {
    CREATED("created"),
    REVIEW("review"),
    APPROVED("approved");


    private String status;
}
