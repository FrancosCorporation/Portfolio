import 'package:flutter/material.dart';
import 'dart:io' show Platform; //at the top

String plataform = 'oi';

//in your code

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    detected();
    return SingleChildScrollView(
        padding: const EdgeInsets.symmetric(horizontal: 20),
        child: Column(children: <Widget>[
          /* Text(plataform), */
          TextFormField(
              decoration: const InputDecoration(
                  border: UnderlineInputBorder(),
                  filled: true,
                  icon: Icon(Icons.account_circle),
                  hintText: 'Name')),
          TextFormField(
              decoration: const InputDecoration(
                  border: UnderlineInputBorder(),
                  filled: true,
                  icon: Icon(Icons.email),
                  hintText: 'Email-Address'))
        ]));
  }
}

void detected() {
  if (Platform.isWindows) {
    plataform = 'Windows';
  } else if (Platform.isAndroid) {
    plataform = 'Android';
  } else if (Platform.isIOS) {
    plataform = 'iOS';
  }
}
