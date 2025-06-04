<?php
require_once 'models/Pessoa.php';

class PessoaController {
    public function mostrar() {
        $pessoa = new Pessoa("Maria");
        include 'views/pessoaView.php';
    }
}
?>