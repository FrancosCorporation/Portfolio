import 'package:flutter/material.dart';


class PlayerPlay extends StatelessWidget {

  Widget build(BuildContext context) {
    return ImageIcon(
      AssetImage('images/play.png'),
    );
  }
}
class PlayerNext extends StatelessWidget {

  Widget build(BuildContext context) {
    return ImageIcon(
      AssetImage('images/next.png'),
    );
  }
}
class PlayerPrevius extends StatelessWidget {

  Widget build(BuildContext context) {
    return ImageIcon(
      AssetImage('images/previus.png'),
    );
  }
}
class PlayerStop extends StatelessWidget {

  Widget build(BuildContext context) {
    return ImageIcon(
      AssetImage('images/stop.png'),
    );
  }
}
