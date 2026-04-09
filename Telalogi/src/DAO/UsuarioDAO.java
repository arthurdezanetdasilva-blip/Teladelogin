/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.UsuarioDTO;

public class UsuarioDAO {

    public boolean autenticar(UsuarioDTO usuarioDTO) {

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        if (usuarioDTO.getUsuario().equals(usuarioCorreto) &&
            usuarioDTO.getSenha().equals(senhaCorreta)) {
            return true;
        } else {
            return false;
        }
    }
}