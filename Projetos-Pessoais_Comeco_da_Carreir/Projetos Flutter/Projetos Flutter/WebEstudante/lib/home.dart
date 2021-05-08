import 'package:flutter/material.dart';

class Home2 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
        child: MaterialButton(
      child: Text("oi"),
      onPressed: () {
        Navigator.pop(context);
        Slider.adaptive(value: 0, onChanged: null);
      },
    ));
  }
}
