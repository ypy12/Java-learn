'''
Description: 
Author: YPY
Date: 2021-11-30 22:51:58
LastEditTime: 2021-11-30 22:54:07
LastEditors: YPY
Reference: 
'''
import base64
pic=open('笔记\\操作系统\\pic\\cache.jpg','rb')
is_f=base64.b64encode(pic.read())
pic.close()
print(is_f)