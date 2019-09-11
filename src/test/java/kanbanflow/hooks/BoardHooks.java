package kanbanflow.hooks;

import cucumber.api.java.Before;

public class BoardHook {

    @Before("@FindContact, @DeleteContact, @UpdateContact")
    public void beforeDeleteContact() {
        String name = ValueAppender.prefix() + "Contact" + ValueAppender.suffix();
        String key = "lastName";
        String json = String.format("{\"%s\": \"%s\"}", key, name);
        contactApi.setContent(json);
        Response response = contactApi.postContent();
        context.setResponse(response);
        context.getContact().setId(response.jsonPath().getString("id"));
        response.prettyPrint();
    }
}
