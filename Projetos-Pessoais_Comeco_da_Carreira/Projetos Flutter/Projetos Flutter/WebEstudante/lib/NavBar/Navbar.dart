import 'package:WebEstudante/home.dart';
import 'package:WebEstudante/main.dart';
import 'package:flutter/material.dart';

class NavBar extends StatelessWidget {
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
  Widget build(BuildContext context, Widget padrao) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 40, horizontal: 40),
      child: Container(
        constraints:
            BoxConstraints(maxWidth: MediaQuery.of(context).size.width),
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Row(
              children: [
                MaterialButton(
                  color: Colors.transparent,
                  shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.all(Radius.circular(30))),
                  onPressed: () {},
                  child: Text(
                    "Home",
                    style: TextStyle(
                        color: Colors.white,
                        fontSize: 40,
                        fontWeight: FontWeight.bold),
                  ),
                ),
                SizedBox(width: 30),
                Text(
                  "Aboust us",
                  style: TextStyle(color: Colors.white, fontSize: 30),
                ),
                SizedBox(width: 30),
                Text(
                  "Novidades",
                  style: TextStyle(color: Colors.white, fontSize: 30),
                ),
                SizedBox(width: 30),
              ],
            ),
            Text(
              "Portal Web Estudante",
              style: TextStyle(
                  fontWeight: FontWeight.bold,
                  color: Colors.white,
                  fontSize: 30),
            ),
          ],
        ),
      ),
    );
  }
}

class MobileNavBar extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 40, horizontal: 40),
      child: Container(
        constraints: BoxConstraints(minHeight: 400),
        child: Column(
          children: <Widget>[
            RaisedButton(
                color: Colors.transparent,
                elevation: 40,
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.all(Radius.circular(10))),
                onPressed: () {},
                child: Text(
                  "Portal Web Estudante",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    color: Colors.white,
                    fontSize: 40,
                  ),
                )),
            Padding(
              padding: const EdgeInsets.all(20.0),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  MaterialButton(
                    color: Colors.white,
                    shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.all(Radius.circular(10))),
                    onPressed: () {
                      Navigator.push(context,
                          MaterialPageRoute(builder: (context) => Home2()));
                    },
                    child: Text(
                      "Home",
                      style: TextStyle(
                          color: Colors.cyan[200],
                          fontSize: 40,
                          fontWeight: FontWeight.bold),
                    ),
                  ),
                  SizedBox(width: 30),
                  MaterialButton(
                      color: Colors.white,
                      shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.all(Radius.circular(10))),
                      onPressed: () {},
                      child: Text(
                        "About",
                        style: TextStyle(
                            color: Colors.cyan[200],
                            fontSize: 40,
                            fontWeight: FontWeight.bold),
                      )),
                  SizedBox(width: 30),
                  MaterialButton(
                      color: Colors.white,
                      shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.all(Radius.circular(10))),
                      onPressed: () {},
                      child: Text(
                        "Novidades",
                        style: TextStyle(
                            color: Colors.cyan[200],
                            fontSize: 40,
                            fontWeight: FontWeight.bold),
                      )),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
