package org.malagueta.fintech.exception;

public enum ServiceCatalogMessages {
    PASSWORD_INCORRECT("Senha antiga incorrecta",MessageType.ERROR,"ER01"),
    USER_NAME_NOT_FOUND("conta nao encontrada ou problemas tecnicos",MessageType.ERROR,"ER02"),
    PASSWORD_ALTERADA_COM_SUCESSO("Password alterado com sucesso",MessageType.SUCCESS ,"0" );
    private final String content;
    private final MessageType type;
    private final String messageCode;

    ServiceCatalogMessages(String content, MessageType type, String messageCode){
        this.content=content;
        this.type=type;
        this.messageCode=messageCode;
    }

    public String getContent() {
        return content;
    }

    public MessageType getType() {
        return type;
    }

    public String getMessageCode() {
        return messageCode;
    }
public String toString(){
    StringBuilder messageJson=new StringBuilder();
    messageJson.append("{message:");
    messageJson.append(getContent());
    messageJson.append(",");

    messageJson.append("type:");
    messageJson.append(getType());
    messageJson.append(",");

    messageJson.append("code:");
    messageJson.append(getMessageCode());
    messageJson.append("}");
    return messageJson.toString();
}
    public enum MessageType{
        WARNING,
        ERROR,
        SUCCESS
    }

}


