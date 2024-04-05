package insper.store.aluno;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "store-aluno")
public interface AlunoController {

    @PostMapping("/aluno")
    public ResponseEntity<AlunoOut> create(
        @RequestBody(required = true) AlunoIn in
    );
    

    public ResponseEntity<AlunoOut> read(
        @PathVariable(required = true) String id
    );
}