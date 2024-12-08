package co.com.common.utils.Email;

import lombok.Builder;

@Builder
public record MailBody(String to, String subject, String body, boolean isHtml) {

}
