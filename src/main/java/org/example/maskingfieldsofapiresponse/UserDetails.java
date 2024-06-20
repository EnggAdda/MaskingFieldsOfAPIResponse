package org.example.maskingfieldsofapiresponse;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class UserDetails {

    private String userName;
    @Mask
    @JsonSerialize(using = MaskingSerializer.class)
    private String userEmail;
    @Mask
    @JsonSerialize(using = MaskingSerializer.class)
    private String contactNo;
}
