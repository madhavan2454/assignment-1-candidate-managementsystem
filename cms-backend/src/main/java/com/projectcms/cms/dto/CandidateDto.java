package com.projectcms.cms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDto {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String resumeLink;
    private String currentStatus;
}
