# Generated by Django 2.1.7 on 2019-03-17 04:45

from django.conf import settings
from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [("doctors", "0001_initial")]

    operations = [
        migrations.AlterField(
            model_name="profile",
            name="user",
            field=models.OneToOneField(
                on_delete=django.db.models.deletion.CASCADE,
                related_name="doctor_profile",
                to=settings.AUTH_USER_MODEL,
            ),
        )
    ]