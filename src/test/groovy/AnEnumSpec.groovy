import spock.lang.Specification

class AnEnumSpec extends Specification {

    def "has correct error status"() {
        expect:
        result == anEnum.isError

        where:
        anEnum   | result
        AnEnum.A | true
        AnEnum.B | false
        AnEnum.C | false
        AnEnum.D | true
    }
}

public enum AnEnum {
    A(true), B(false), C(false), D(true);
    boolean isError

    AnEnum(boolean isError) {
        this.isError = isError
    }
}
