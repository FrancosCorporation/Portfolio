import 'package:flutter/material.dart';

double tamanho = 550;

class HomePage2 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        alignment: Alignment.center,
        child: ListView(
          children: <Widget>[
            SizedBox(
              height: 350,
              child: Image.asset("imagens/welcome.jpg"),
            ),
            Container(
              alignment: Alignment.center,
              child: SizedBox(
                  width: tamanho,
                  child: TextFormField(
                    textAlign: TextAlign.center,
                    keyboardType: TextInputType.emailAddress,
                    decoration: InputDecoration(
                        labelText: "E-mail",
                        labelStyle: TextStyle(
                          color: Colors.black38,
                          fontWeight: FontWeight.w200,
                          fontSize: 20,
                        )),
                  )),
            ),
            Container(
                alignment: Alignment.center,
                child: SizedBox(
                    width: tamanho,
                    child: TextFormField(
                      textAlign: TextAlign.center,
                      keyboardType: TextInputType.text,
                      obscureText: true,
                      decoration: InputDecoration(
                          labelText: "Senha",
                          labelStyle: TextStyle(
                            color: Colors.black38,
                            fontWeight: FontWeight.w200,
                            fontSize: 20,
                          )),
                    ))),
            Container(
              width: tamanho,
              child: FlatButton(
                child: Text(
                  "Recuperar Senha",
                  textAlign: TextAlign.center,
                ),
                onPressed: () {},
              ),
            ),
            Container(
              height: 40,
              child: FlatButton(
                child: Text("Novo Cadastro", textAlign: TextAlign.center),
                onPressed: () {},
              ),
            )
          ],
        ),
      ),
    );
  }
}
