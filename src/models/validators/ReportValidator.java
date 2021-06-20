package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
   public static List<String> validate(Report r) {
    List<String> errors = new ArrayList<String>();

    String title_error = _validateTitle(r.getTitle());
    if(!title_error.equals("")) {
        errors.add(title_error);
    }

    String start_time_error = _validateStart_time(r.getStart_time());
    if(!start_time_error.equals("")) {
        errors.add(start_time_error);
    }

    String finish_time_error = _validateFinish_time(r.getFinish_time());
    if(!finish_time_error.equals("")) {
        errors.add(finish_time_error);
    }

    String content_error = _validateContent(r.getContent());
    if(!content_error.equals("")) {
        errors.add(content_error);
    }

    return errors;
}

private static String _validateTitle(String title) {
    if(title == null || title.equals("")) {
        return "タイトルを入力してください。";
        }

    return "";
}

private static String _validateStart_time(String start_time) {
    if(start_time == null || start_time.equals("")) {
        return "出勤時間を入力してください。";
        }

    return "";
}

private static String _validateFinish_time(String finish_time) {
    if(finish_time == null || finish_time.equals("")) {
        return "退勤時間を入力してください。";
        }

    return "";
}
private static String _validateContent(String content) {
    if(content == null || content.equals("")) {
        return "内容を入力してください。";
        }

    return "";
}
}