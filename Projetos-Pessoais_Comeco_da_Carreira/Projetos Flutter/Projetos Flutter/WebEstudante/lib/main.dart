import 'package:WebEstudante/NavBar/Navbar.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      endDrawer: Drawer(
          child: ListView(
        children: <Widget>[
          UserAccountsDrawerHeader(
              accountName: Text("Hello"), accountEmail: Text("teste@gmail.com"))
        ],
      )),
      body: Container(
        decoration: BoxDecoration(
            gradient: LinearGradient(
                begin: Alignment.topCenter,
                end: Alignment.bottomCenter,
                colors: [
              //blue more dark
              Color.fromRGBO(0, 255, 255, 50),
              //blue light
              Color.fromRGBO(0, 128, 255, 50)
            ])),
        child: Column(
          children: <Widget>[
            NavBar(),
          ],
        ),
      ),
    );
  }
}
