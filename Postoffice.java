public static void main(String[] args) {
        scanner  = new Scanner(System.in);
        String command = null;
        Mail mail = null;
        while(true){
        command = scanner.nextLine();
        if(command.equals("Просмотеть нахождение товара")){
        mail = createMail();
        mails.add(mail);
        }
        else if(command.equals("Введите имя")){
        Mail mail1 = findCurrentMail(mails);
        if(mail1 == null){
        System.out.println("Владлельца нет");
        }
        else {
        System.out.println(mail.getOrdernumber());
        System.out.println(mail.getOwner());
        System.out.println(mail.getWeight());
        }
        }
        else if(command.equals("изменить")){
        changeInfo(mail);
        }
        }
        }

private static Mail findCurrentMail(List<Mail> mails) {
        System.out.println("Введи номер заказа");
        String string = scanner.nextLine();
        for(Mail mail:mails){
        if(mail.getOrdernumber().equals(string)){
        return mail;
        }
        }
        return null;
        }

private static Mail createMail() {
        System.out.println("Введи номер заказа");
        String ordernumber = scanner.nextLine();
        System.out.println("Введи имя владельца");
        String owner = scanner.nextLine();
        Mail mail = new Mail(ordernumber,owner,(double) 20, new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis() + 656565464));
        return mail;
        }





        }
private static Mail findCurrentMail(List<Mail> mails) {
        System.out.println("Введи номер заказа");
        String string = scanner.nextLine();
        for(Mail mail:mails){
        if(mail.getOrdernumber().equals(string)){
        return mail;
        }
        }
        return null;
        }

private static Mail createMail() {
        System.out.println("Введи номер заказа");
        String ordernumber = scanner.nextLine();
        System.out.println("Введи имя владельца");
        String owner = scanner.nextLine();
        Mail mail = new Mail(ordernumber,owner,(double) 20, new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis() + 656565464));
        return mail;
        }





        }
