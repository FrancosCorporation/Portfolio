import 'package:flutter/material.dart';
import 'package:interagecomapi/HomePage.dart';

class VerificadorPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return LayoutBuilder(builder: (context, constrains) {
      if (constrains.maxWidth > 900 && constrains.maxWidth < 1200) {
        return DesktopNavBar();
      } else if (constrains.maxWidth > 1200) {
        return DesktopNavBar();
      } else {
        return MobileNavBar();
      }
    });
  }
}

class DesktopNavBar extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Padding(
        padding: const EdgeInsets.symmetric(vertical: 40, horizontal: 40),
        child: HomePage());
  }
}

class MobileNavBar extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: HomePage(),
    );
  }
}
