package com.company.model;

import com.company.exception.AutenticacaoException;

public interface Autenticacao {
    String autenticacao() throws AutenticacaoException;
}
