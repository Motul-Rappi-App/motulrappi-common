package co.com.common.dto.Email;

import lombok.Builder;

@Builder
public record MailBody(String to, String subject, String body) {

}
