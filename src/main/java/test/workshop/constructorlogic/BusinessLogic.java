package test.workshop.constructorlogic;

import java.util.Objects;

public class BusinessLogic {

    private final ValidatorStorage validatorStorage = new ValidatorStorage();
    private final FileReaderService fileReaderService = new FileReaderService();

    public BusinessLogic() {
        validatorStorage.add(new Validator(Objects::nonNull));
        validatorStorage.add(new Validator(s -> !s.isEmpty()));
        validatorStorage.add(new Validator(s -> s.endsWith(".txt")));
    }

    public String doStuff(String filePath) {
        if (isValid(filePath)) {
            return fileReaderService.readContent(filePath);
        }
        return "";
    }

    private boolean isValid(String s) {
        return validatorStorage.getValidators().stream().allMatch(validator -> validator.isValid(s));
    }
}
