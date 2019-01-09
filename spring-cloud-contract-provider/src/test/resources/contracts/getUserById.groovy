package contracts

import org.springframework.cloud.contract.spec.Contract

/**
 * Created by gloria on 27/11/2018.
 */
Contract.make {
    request {
        method 'POST'
        urlPath $(regex('/getUserById/1'))
    }
    response {
        status 200
        body("""{"name":"test"}""")
        headers {
            contentType(applicationJson())
        }
    }
}
