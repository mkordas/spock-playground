import spock.lang.Specification

import static com.google.common.io.Resources.getResource
import static com.google.common.io.Resources.toString
import static groovy.json.internal.Charsets.UTF_8

class ResourcesSpec extends Specification{
    def readsResource() {
        expect:
        toString(getResource("text.txt"), UTF_8).trim() == 'text'
    }
}
