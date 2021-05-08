import 'package:flutter/material.dart';

class PageLogin extends StatefulWidget {
  @override
  _PageLoginState createState() => _PageLoginState();
}

class _PageLoginState extends State<PageLogin> {
  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
        padding: const EdgeInsets.symmetric(horizontal: 16),
        child: Column(children: <Widget>[
          TextField(
            textCapitalization: TextCapitalization.words,
          ),
          TextFormField(
              decoration: const InputDecoration(
                  border: UnderlineInputBorder(),
                  filled: true,
                  icon: Icon(Icons.email),
                  hintText: 'Email-Address'))
        ]));
  }
}
