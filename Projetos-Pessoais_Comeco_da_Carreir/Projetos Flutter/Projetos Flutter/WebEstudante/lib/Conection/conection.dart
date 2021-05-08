import 'package:APDB/auth/auth_login.dart';
import 'package:flutter/material.dart';

class AuthScreen extends StatelessWidget {
  final api = ApiAutotrac(
      'acbc6de9707146e7bb42468d925da25c', 'suporte@intertracj', '2606720');

  @override
  Widget build(BuildContext context) {
    return Center(
      child: FutureBuilder(
          future: api.getApi(),
          builder: (context, snapshot) {
            print(snapshot.data);
            return snapshot.data == null
                ? SizedBox(
                    width: 50,
                    height: 50,
                    child: CircularProgressIndicator(
                      valueColor: AlwaysStoppedAnimation<Color>(Colors.grey),
                    ),
                  )
                : snapshot.data == 200
                    ? Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          Text(
                            'Sucesso',
                            style: TextStyle(
                                fontSize: 20,
                                fontFamily: 'Segoe',
                                color: Colors.black,
                                fontWeight: FontWeight.w700,
                                decoration: TextDecoration.none),
                          ),
                          Icon(
                            Icons.check,
                            size: 60,
                            color: Colors.green,
                          )
                        ],
                      )
                    : Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          Text(
                            'Chave da API, usuário ou senha incorretos',
                            style: TextStyle(
                                fontSize: 20,
                                fontFamily: 'Segoe',
                                color: Colors.black,
                                fontWeight: FontWeight.w700,
                                decoration: TextDecoration.none),
                          ),
                          Icon(
                            Icons.close_rounded,
                            size: 60,
                            color: Colors.red,
                          )
                        ],
                      );
          }),
    );
  }
}
